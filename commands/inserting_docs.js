doc = { "name" : "Smith" , "age" : 30 , "profession" : "hacker" };
db.people.insert(doc);
db.people.find();
db.people.insert({"name" : "Jones" , "age" : 35 , "profession" : "baker" });
db.people.find();