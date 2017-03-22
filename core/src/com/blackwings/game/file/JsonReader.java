package com.blackwings.game.file;

public class JsonReader {
    Object jsonObject;

    public Object read(String filePath) {
//        try {
//            FileReader reader = new FileReader(filePath);
//            JSONParser parser = new JSONParser(filePath);
//            jsonObject = parser.parse(reader);
//
////            String travelName = (String) jsonObject.get("name");
//        } catch (FileNotFoundException ex) {
////            Logger.getLogger(getCityIDs.class.getName()).log(Level.SEVERE, null, ex);
////        } catch (IOException | ParseException ex) {
////            Logger.getLogger(getCityIDs.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        return jsonObject;
        // JSONObject jsonObject = (JSONObject) parser.parse(getClass().getResource("/json/city.list.json").toString());

//        InputStream fis = new FileInputStream(JSON_FILE);
//
//        //create JsonReader object
//        JsonReader jsonReader = Json.createReader(fis);
//
//        /**
//         * We can create JsonReader from Factory also
//         JsonReaderFactory factory = Json.createReaderFactory(null);
//         jsonReader = factory.createReader(fis);
//         */
//
//        //get JsonObject from JsonReader
//        JsonObject jsonObject = jsonReader.readObject();
//
//        //we can close IO resource and JsonReader now
//        jsonReader.close();
//        fis.close();

//        Json json = new Json();
//        String text = json.toJson(person);
//        Person person2 = json.fromJson(Person.class, text);
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
//        return new Object();
    }

}