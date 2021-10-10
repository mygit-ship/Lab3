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
