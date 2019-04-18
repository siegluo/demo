* 创建数据库
`use DATABASE_NAME `

* 查看数据库 
`show dbs`

* 删除当前数据库
`db.dropDatabase()`

* 删除集合
`db.collection.drop()`

* 插入文档
`db.COLLECTION_NAME.insert(document)`

* 更新文档
`db.collection.update( criteria, objNew, upsert, multi )`
  * criteria : update的查询条件，类似sql update查询内where后面的。
  * objNew : update的对象和一些更新的操作符（如$,$inc...）等，也可以理解为sql update查询内set后面的
  * upsert : 这个参数的意思是，如果不存在update的记录，是否插入objNew,true为插入，默认是false，不插入。
  * multi : mongodb默认是false,只更新找到的第一条记录，如果这个参数为true,就把按条件查出来多条记录全部更新。
  
* 删除文档
`db.collection.remove(
   <query>,
   {
     justOne: <boolean>,
     writeConcern: <document>
   }
)`
  * query :（可选）删除的文档的条件。
  * justOne : （可选）如果设为 true 或 1，则只删除一个文档。
  * writeConcern :（可选）抛出异常的级别。
  
* 查询文档
 `db.COLLECTION_NAME.find().pretty()`
 
* and or 条件查询
```
 db.col.find(
                {"likes": {$gt:50}, 
                $or: [{"by": "w3cschool"},
                {"title": "MongoDB 教程"}]}
            ).pretty()
 ```
  * (>) 大于 - $gt
  * (<) 小于 - $lt
  * (>=) 大于等于 - $gte
  * (<= ) 小于等于 - $lte
  
* $type

  如果想获取 "col" 集合中 title 为 String 的数据，你可以使用以下命令：
  
  ```
  db.col.find({"title" : {$type : 2}})
  ```
* LIST SKIP
    ```sql
    db.COLLECTION_NAME.find().limit(NUMBER).skip(NUMBER)
    ```  
* sort
    ```sql
    db.mycol.find({},{"title":1,_id:0}).sort({"title":-1})
    ```
* 聚合
    ```
    db.mycol.aggregate([{$group : {_id : "$by_user", num_tutorial : {$sum : 1}}}])
    ```
    |表达式|	描述|	实例|
    | --- | --- | ---|
    |$sum	|计算总和	|db.mycol.aggregate([{$group : {_id : "$by_user", num_tutorial : {$sum : "$likes"}}}])
    |$avg	|计算平均值	|db.mycol.aggregate([{$group : {_id : "$by_user", num_tutorial : {$avg : "$likes"}}}])
    |$min	|获取集合中所有文档对应值得最小值。	|db.mycol.aggregate([{$group : {_id : "$by_user", num_tutorial : {$min : "$likes"}}}])
    |$max	|获取集合中所有文档对应值得最大值。|	db.mycol.aggregate([{$group : {_id : "$by_user", num_tutorial : {$max : "$likes"}}}])
    |$push	|在结果文档中插入值到一个数组中。	|db.mycol.aggregate([{$group : {_id : "$by_user", url : {$push: "$url"}}}])
    |$addToSet|	在结果文档中插入值到一个数组中，但不创建副本。|	db.mycol.aggregate([{$group : {_id : "$by_user", url : {$addToSet : "$url"}}}])
    |$first	|根据资源文档的排序获取第一个文档数据。|	db.mycol.aggregate([{$group : {_id : "$by_user", first_url : {$first : "$url"}}}])
    |$last	|根据资源文档的排序获取最后一个文档数据	|db.mycol.aggregate([{$group : {_id : "$by_user", last_url : {$last : "$url"}}}])
    
