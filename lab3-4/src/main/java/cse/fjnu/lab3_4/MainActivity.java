package cse.fjnu.lab3_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //把listview显示出来
        showListView();
    }

    private void showListView() {

        ListView listView=(ListView) findViewById(R.id.lv);
        ArrayAdapter adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,getData());
        listView.setAdapter(adapter);
        //给view注册上下文菜单
        registerForContextMenu(listView);
    }

    /*
     *2， 构造listview显示的数据
     */
    private ArrayList<String> getData(){
        ArrayList<String>list=new ArrayList<String>();

        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        return list;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.c:
                Toast.makeText(this, "点击复制", Toast.LENGTH_SHORT).show();
                break;
            case R.id.v:
                Toast.makeText(this, "点击粘贴", Toast.LENGTH_SHORT).show();
                break;
            case R.id.x:
                Toast.makeText(this, "点击剪切", Toast.LENGTH_SHORT).show();
                break;
            case R.id.r:
                Toast.makeText(this, "点击重命名", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }




}