package com.ameron32.wardrobemanagera;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
  
  public static final int RESULT_ADD_ITEM = 1319181;
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    
    findViewById(R.id.bAddItem).setOnClickListener(new OnClickListener() {

      @Override
      public void onClick(View v) {
        
        Intent i = new Intent(MainActivity.this, AddItemActivity.class);
        startActivityForResult(i, RESULT_ADD_ITEM);
      }
    });
  }
  
  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
  }
  
}
