package com.blackwings.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BlackStarsGame extends ApplicationAdapter {
//    private Array<Ship> shipsList = new Array<Ship>();
    //    private Vector2 cruiserPosition = new Vector2();
//    private Vector2 cruiserVelocity = new Vector2();
//    private com.blackwings.game.world.World world;

//    private void prepareGameObjects() {
//        String name = "Nameless one";
//        SubSystemsList subSystemsList = new SubSystemsList();
//
//        RailGun railGun = new RailGun();
//        ImpulseEngine impulseEngine = new ImpulseEngine();
//
//        subSystemsList.add(railGun);
//        subSystemsList.add(impulseEngine);
//
//        Cruiser cruiser = new Cruiser(name, subSystemsList);
//        PositionData positionData = new PositionData(0, 0, 0, 0);// fake
//        cruiser.setPosition(positionData);
//
//        shipsList.add(cruiser);
//    }


    private FileReader getFile(String fileName) {
        FileReader file = null;
        try {
            file = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.print("File not found");
            e.printStackTrace();
        }

        return file;
    }

    private void invoke(FileReader file, String method, String args) {
        final String ENGINE_NAME = "nashorn";
        ScriptEngine engine = new ScriptEngineManager().getEngineByName(ENGINE_NAME);

        try {
            engine.eval(file);
//            engine.eval("print('hello world')");
            Invocable invocable = (Invocable) engine;
            Object result = invocable.invokeFunction(method, args);
            System.out.println(result);
        } catch (ScriptException e) {
            System.out.print("Script error");
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            System.out.print("No such method");
            e.printStackTrace();
        }
    }

    @Override
    public void create() {

        String version = System.getProperty("java.version");
        System.out.print("Run under JAVA: " + version);

        //TODO (S.Panfilov) will be better to read it during the build time
        FileReader file = getFile("desktop/assets/js/Main.js");
        String fnName = "Main";
        String fnArgs = null;
        invoke(file, fnName, fnArgs);


//        Array<String> levelsList = new Array<String>();
//        levelsList.add("first");
//        Loader loader = new Loader(levelsList);
//        prepareGameObjects();
//
//        com.blackwings.game.world.WorldObjects worldObjects = new WorldObjects(shipsList);
////        Store.setWorldObjects(worldObjects);
//
//      //TODO (S.Panfilov) map should be created with some params
//        Map map = new Map();
//        //Store.setMap(map);

//        com.blackwings.game.camera.Camera camera = new com.blackwings.game.camera.Camera();
////        Store.setCamera(camera);

//        world = new com.blackwings.game.world.World(worldObjects, camera);
////        Store.setWorld(world);
//
//        world.reset();
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

//        world.update();
//        world.draw();
    }

    @Override
    public void dispose() {
//        world.clear();
    }
}
