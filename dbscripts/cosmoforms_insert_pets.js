/**
 * Created by mc7995 on 6/22/17.
 */
db = connect("localhost:27017/testpets");
db.pets.insert({ "id_field" : 2343242323, "nombre" : "Cosmo", "age" : 8, "active" : true, "favorite_foods" : [ "purina one", "water", "blue buffalo biscuits", "deli meats", "wood", "rubber" ], "exercise_schedule" : [ { "day" : "monday", "start_time" : "6:00", "end_time" : "7:30", "active_day" : true }, { "day" : "thursday", "start_time" : "16:00", "end_time" : "18:00", "active_day" : false } ], "res_address" : { "street" : "123 main st", "city" : "los angeles", "state" : "wa", "zip" : 90023 }, "biz_address" : { "street" : "987 center ct", "city" : "san fransico", "state" : "ca", "zip" : 91123 }, "allergies" : [ "peanuts", "chocolate", "milk" ], "moar_allergies" : [ "peanuts", "chocolate", "milk" ] });
db.pets.insert({ "favorite_foods" : [ "dry food", "carrots", "bbq chips", "taco bell tacos" ], "res_address" : { "zip" : 90234, "city" : "san diego", "street" : "123 center court", "state" : "ca" }, "active" : true, "nombre" : "Milo", "exercise_schedule" : [ { "start_time" : "16:00", "end_time" : "18:00", "active_day" : true, "day" : "monday" }, { "start_time" : "12:00", "end_time" : "14:00", "active_day" : true, "day" : "wednesday" } ], "age" : 12, "coat" : "short", "friendly" : true, "shakes" : "yes" });
db.pets.insert({ "nombre" : "Zara", "age" : 1 });
db.pets.insert({ "nombre" : "Otis", "age" : 2, "snacks" : [ "water", "tacos" ] });
db.pets.insert({ "nombre" : "Eddie", "age" : 12 });
