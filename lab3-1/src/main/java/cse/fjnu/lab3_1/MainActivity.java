package cse.fjnu.lab3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<HashMap<String,Object>> listData=new ArrayList<HashMap<String,Object>>();
    SimpleAdapter adapter;
    HashMap<String,Object> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listview1);
        int[] images={R.drawable.cat,R.drawable.dog,R.drawable.elephant,R.drawable.lion,R.drawable.monkey,R.drawable.tiger};
        String[] names={"cat","dog","elephant","lion","monkey","tiger"};
        for (int i=0;i<6;i++){
            data=new HashMap<String,Object>();
            data.put("img",images[i]);
            data.put("animalname",names[i]);
            listData.add(data);
        }

        String[] form={"img","animalname"};
        int [] to ={R.id.AnimalImage,R.id.AnimalName};
        SimpleAdapter adapter=new SimpleAdapter(MainActivity.this,listData,R.layout.item,form,to);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new  AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view, int position,long  id) {
                TextView textView = view.findViewById(R.id.AnimalName);
//                String sth = "总共有："+parent.getCount()+"行数据"
//                        +"\n该item里的Name值："+textView.getText().toString()
//                        +"\n当前点击第："+position+"行";
//                Toast.makeText(MainActivity.this, sth,Toast.LENGTH_SHORT).show();
                TextView button=(TextView)findViewById(R.id.button);
                button.setText(textView.getText().toString());

            }
        });
    }


}