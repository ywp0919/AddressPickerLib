# AddressPickerLib
# 仿京东地址选择器


# 依赖方法
#### 在project的build.gradle里面这么写   
    maven { url 'https://jitpack.io' }
#### 然后在app 的build.gradle      
   compile 'com.github.ywp0919:AddressPickerLib:1.0.1'
   
## 看图片效果可以前往博客地址看是不是朋友需要的效果再决定要不要使用。
[http://blog.csdn.net/qianniyoushouzuo/article/details/78714847](http://blog.csdn.net/qianniyoushouzuo/article/details/78714847).

# 使用方法
#### 不管是用在popwindow上还是在activity或者fragment里面，都只要直接就在xml文件里面这么用就行了
#

  <com.ywp.addresspickerlib.AddressPickerView

       android:id="@+id/apvAddress"
    
       app:layout_constraintBottom_toBottomOf="parent"
    
       android:layout_width="match_parent"
    
       android:layout_height="wrap_content">
    

  </com.ywp.addresspickerlib.AddressPickerView>

#### 然后再设置一下回调就行了，如下

#
   addressView.setOnAddressPickerSure(new AddressPickerView.OnAddressPickerSureListener() {

       @Override
       public void onSureClick(String address, String provinceCode, String cityCode, String districtCode) {
    
           mTvAddress.setText(address);
        
       }
    
   });

#
 

