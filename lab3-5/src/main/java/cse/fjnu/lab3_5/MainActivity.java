package cse.fjnu.lab3_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] strs = {"One", "Two", "Three", "Four"};
    ArrayAdapter aAdpt=new ArrayAdapter<String>(this,android.R.layout.activity_list_item,strs);
    ListView lv = (ListView) findViewById(R.id.lv);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init() {
        lv.setAdapter(aAdpt);
        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            public boolean onItemLongClick(AdapterView parent, View view, int position, long id) {
                System.out.println("Long click");
                startActionMode(modeCallBack);
                view.setSelected(true);
                return true;
            }
        });
        registerForContextMenu(lv);
    }

    private ActionMode.Callback modeCallBack = new ActionMode.Callback() {

        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {

            return false;
        }

        public void onDestroyActionMode(ActionMode mode) {
            mode = null;
        }

        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.menu, menu);
            return true;
        }

        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            int id = item.getItemId();
            switch (id) {
                case R.id.delete: {

                   // aAdpt.remove(aAdpt.getItem(aAdpt.currentSelection));


                    System.out.println(" delete ");
                    mode.finish();
                    break;
                }
                case R.id.edit: {

                    System.out.println(" edit ");
                    break;
                }
                default:
                    return true;

            }
            return true;
        }


    };
}
