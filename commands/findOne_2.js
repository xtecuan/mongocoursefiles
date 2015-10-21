db.people.findOne();
db.people.findOne({"name": "Jones"});
db.people.findOne({"name": "Jones"},{"name": true, "_id": false});
db.people.findOne({"name": "Jones"},{"name": true, "_id": false,"profession":true});