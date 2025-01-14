package com.edu.kygroup.utils;

import com.edu.kygroup.ui.KygroupApplication;

import android.content.Context;
import android.widget.Toast;

public class ToastUtils {
	private static Toast mToast = null;
	
	
	public static void showLongToast(Context context,int id){
		if(null != context){
			if(null == mToast){
				mToast = Toast.makeText(context, id, Toast.LENGTH_LONG);
			}else{
				mToast.setText(id);
			}	
			mToast.show();
		}
	}
	
	public static void showLongToast(Context context,String content){
		if(null != context){
			if(null == mToast){
				mToast = Toast.makeText(context,content,Toast.LENGTH_LONG);
			}else{
				mToast.setText(content);
			}	
			mToast.show();
		}
	}
	
	public static void showShortToast(Context context,int id){
		if(null != context){
			if(null == mToast){
				mToast = Toast.makeText(context, id, Toast.LENGTH_SHORT);
			}else{
				mToast.setText(id);
			}	
			mToast.show();
		}
	}
	
	public static void showShortToast(String str){
		if(null == mToast){
			mToast = Toast.makeText(KygroupApplication.getApplication(), str, Toast.LENGTH_SHORT);
		}else{
			mToast.setText(str);
		}	
		mToast.show();
	}
	
	public static void showShortToast(int id){
		if(null == mToast){
			mToast = Toast.makeText(KygroupApplication.getApplication(), id, Toast.LENGTH_SHORT);
		}else{
			mToast.setText(id);
		}	
		mToast.show();
	}
	
	public static void showShortToast(Context context,String content){
		if(null != context){
			if(null == mToast){
				mToast = Toast.makeText(context,content,Toast.LENGTH_SHORT);
			}else{
				mToast.setText(content);
			}	
			mToast.show();
		}
	}
	
	public static void toastPrompt(Context context,int id,int time){
		if(null != context){
			if(null == mToast){
				mToast = Toast.makeText(context, id, time);
			}else{
				mToast.setText(id);
			}	
			mToast.show();
		}
	}
	
	public static void cancelToast(){
		if(null != mToast){
			mToast.cancel();
		}
	}
}
