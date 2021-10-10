# Lab3
## lb3-1---创建上下文操作模式(ActionMode)的上下文菜单（代码在lab3-1文件中）
![Image text]()
### 步骤
#### （1）：mainactivity.xml文件中设置一个listview和textview，总体布局样式
#### （2）： 新建一个item.xml文件并分别设置一个imageview和textview，用于之后listview的（单项）item样式
#### （3）： 在mainActivity文件中，添加适配器SimpleAdapter以及数据HashMap<String,Object> data，将需要赋值的数据放在data中，并通过SimpleAdapter赋值到listview的item中去，并使用适配器
#### 
       //放入图片
       int[] images={R.drawable.cat,R.drawable.dog,R.drawable.elephant,R.drawable.lion,R.drawable.monkey,R.drawable.tiger};
       //单击item后改变的textview名字
        String[] names={"cat","dog","elephant","lion","monkey","tiger"};
      listView=(ListView)findViewById(R.id.listview1);
      //将imageview和textview需要的数据放进data
      for (int i=0;i<6;i++){
            data=new HashMap<String,Object>();
            data.put("img",images[i]);
            data.put("animalname",names[i]);
            listData.add(data);
        }
        //创建适配器
         SimpleAdapter adapter=new SimpleAdapter(MainActivity.this,listData,R.layout.item,form,to);
         //给listview使用适配器
         listView.setAdapter(adapter);
         //添加单击事件
         listView.setOnItemClickListener(new  AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view, int position,long  id) {
                TextView button=(TextView)findViewById(R.id.button);
                button.setText(textView.getText().toString());
            }
        });
## lb3-2---创建自定义布局的AlertDialog（代码在lab3-2文件中）
### 步骤
#### （1）：mainactivity.xml文件中设置一个button，总体布局样式，点击button后会出现自己设置的aletdialog
#### （2）：新建一个item.xml文件，用来设置aletdialog样式，总体样式依照实验所给的图片进行设计
#### （3）：将item的样式应用到aletdialog中，并进行应用
#### （4）:具体代码为
              //获取button组件
              Button botton=findViewById(R.id.button);
              //添加点击事件
        botton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //新建aletdialog
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                //设置item.xml文件中的样式为diaglog
                View view = View.inflate(getApplication(),R.layout.item,null);
                //应用diaglog
                builder.setView(view);
                builder.setCancelable(false);
                final AlertDialog dialog = builder.create();
                dialog.show();
                TextView close = view.findViewById(R.id.close);
                close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

            }
        });
    }

## lb3-3---使用XML定义菜单（代码在lab3-3文件中）
### 步骤
#### （1）：mainactivity.xml文件中设置一个textview，显示一段“用于测试的文字”
#### （2）：在项目的layout中新建一个menu文件夹，并在里面新建一个menu.xml菜单资源文件，在里面设置菜单的样式
            <menu xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto">
    <item
        android:id="@+id/mune_enter"
        android:orderInCategory="100"
        android:title="字体大小"
        app:showAsAction="never">
        <menu>
<!--            <group android:checkableBehavior="single">-->
                <item
                    android:id="@+id/font_big"
                    android:title="大">
                </item>
                <item
                    android:id="@+id/font_middle"
                    android:title="中">
                </item>
                <item
                    android:id="@+id/font_small"
                    android:title="小">
                </item>
<!--            </group>-->
        </menu>
    </item>

    <item
        android:id="@+id/mune_setting"
        android:orderInCategory="100"
        android:title="普通菜单项"
        app:showAsAction="never"></item>

    <item
        android:id="@+id/mune_out"
        android:orderInCategory="100"
        android:title="字体颜色"
        app:showAsAction="never">
        <menu>
<!--            <group android:checkableBehavior="single">-->
                <item
                    android:id="@+id/color_red"
                    android:title="红色">
                </item>
                <item
                    android:id="@+id/color_black"
                    android:title="黑色">
                </item>
<!--            </group>-->
        </menu>
    </item>

</menu>
#### （3）：在java代码中导入菜单布局，并添加菜单项点击事件
        public boolean onCreateOptionsMenu(Menu menu) {
        //导入菜单布局
        MenuInflater    inflater=getMenuInflater();
                inflater.inflate(R.menu.menu1, menu);
        return true;
       }
       //添加点击事件
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
## lb3-4---创建上下文操作模式(ActionMode)的上下文菜单（代码在lab3-4文件中）
### 步骤
#### （1）：mainactivity.xml文件中设置一个
#### （2）：










