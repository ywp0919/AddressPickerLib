package com.ywp.addresspickerdemo;

import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.ywp.addresspickerlib.AddressPickerView;

public class MainActivity extends AppCompatActivity {

    private TextView mTvAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTvAddress = findViewById(R.id.tvAddress);
        mTvAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAddressPickerPop();
            }
        });
        AddressPickerView addressView = findViewById(R.id.apvAddress);
        addressView.setOnAddressPickerSure(new AddressPickerView.OnAddressPickerSureListener() {
            @Override
            public void onSureClick(String address, String provinceCode, String cityCode, String districtCode) {
                mTvAddress.setText(address);
            }
        });
    }

    /**
     * 显示地址选择的pop
     */
    private void showAddressPickerPop() {
        final PopupWindow popupWindow = new PopupWindow(this);
        View rootView = LayoutInflater.from(this).inflate(R.layout.pop_address_picker, null, false);
        AddressPickerView addressView = rootView.findViewById(R.id.apvAddress);
        addressView.setOnAddressPickerSure(new AddressPickerView.OnAddressPickerSureListener() {
            @Override
            public void onSureClick(String address, String provinceCode, String cityCode, String districtCode) {
                mTvAddress.setText(address);
                popupWindow.dismiss();
            }
        });
        popupWindow.setContentView(rootView);
        popupWindow.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
        popupWindow.setHeight(ViewGroup.LayoutParams.MATCH_PARENT);
        popupWindow.showAsDropDown(mTvAddress);

    }
}
