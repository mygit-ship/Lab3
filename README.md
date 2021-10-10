# Lab3
## lb3-1---创建上下文操作模式(ActionMode)的上下文菜单（代码在lab3-1文件中）
![Image text]()
### 步骤
#### （1）：mainactivity.xml文件中设置一个listview和textview，总体布局样式
#### （2）： 新建一个item.xml文件并分别设置一个imageview和textview，用于之后listview的（单项）item样式
#### （3）： 在mainActivity文件中，添加适配器SimpleAdapter以及数据HashMap<String,Object> data，将需要赋值的数据放在data中，并通过SimpleAdapter赋值到listview的item中去
#### 
      listView=(ListView)findViewById(R.id.listview1);
      for (int i=0;i<6;i++){
            data=new HashMap<String,Object>();
            data.put("img",images[i]);
            data.put("animalname",names[i]);
            listData.add(data);
        }
         SimpleAdapter adapter=new SimpleAdapter(MainActivity.this,listData,R.layout.item,form,to);
