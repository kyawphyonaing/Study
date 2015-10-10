package com.example.user.study;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView mListStudy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListStudy = (ListView) findViewById(R.id.listStudy);

        List<String> studylist = new ArrayList<String>();
        studylist.add("ライフサイクル");
        studylist.add("Service");
        studylist.add("ContentProvider");
        studylist.add("Sqlite3");

        ListAdapter adapter = new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1,studylist);
        mListStudy.setAdapter(adapter);
        //
        String test = "";
        //なんらかの入力
        if(StringUtils.isEmpty(test)){
            //
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        //cooo
        return super.onOptionsItemSelected(item);
    }
}
