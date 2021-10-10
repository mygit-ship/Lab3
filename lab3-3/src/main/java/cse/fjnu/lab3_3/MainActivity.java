package cse.fjnu.lab3_3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        //导入菜单布局
        MenuInflater    inflater=getMenuInflater();
                inflater.inflate(R.menu.menu1, menu);

        return true;

    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        TextView textView=(TextView) findViewById(R.id.textview12);
        super.onOptionsItemSelected(item);
        //switch 判断单击哪个菜单项，并有针对性的做出响应
        switch (item.getItemId()) {

            case R.id.mune_setting:
                Toast.makeText( getApplicationContext(),"您点击了普通菜单项", Toast.LENGTH_SHORT).show();

            case R.id.font_big:
                textView.setTextSize(10 * 2);
                break;
            case R.id.font_middle:
                textView.setTextSize(10);
                break;
            case R.id.font_small:
                textView.setTextSize(10 / 2);
                break;
            case R.id.color_black:
                textView.setTextColor(Color.parseColor("#000000"));
                break;
            case R.id.color_red:
                textView.setTextColor(Color.parseColor("#ff0000"));
                break;
            default:
                break;
        }
        return true;
    }

}