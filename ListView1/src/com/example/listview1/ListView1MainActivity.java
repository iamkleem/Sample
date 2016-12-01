package com.example.listview1;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class ListView1MainActivity extends Activity implements OnItemClickListener {
	
	ListView lv;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view1_main);
        
        this.lv=(ListView) this.findViewById(R.id.listView1);
        this.lv.setOnItemClickListener(this);
    }

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		
		String selected_item=this.lv.getItemAtPosition(arg2).toString();
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
			builder.setTitle("Selected Item");
			builder.setMessage(selected_item);
			builder.setNeutralButton("Okey", null);
			
		AlertDialog dialog=builder.create();
		dialog.show();  
	}


    
}
