/**
 * Write a description of class PacmanGoogleMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PacmanGoogleMapLoader implements StaticMapLoader 
{
    public Map loadMap()
    {
        Map map = new Map();

        addWalls(map);

        addSmallItems(map);

        addPowerItems(map);
        
        map.addObject(new PacMan(), map.getWidth()/2, map.getHeight() - 150);
        map.addObject(new RedPhantom(), 50, map.getHeight() - 140);
        map.addObject(new BluePhantom(), 100, map.getHeight() - 140);
        map.addObject(new PinkPhantom(), 150, map.getHeight() - 140);
        map.addObject(new OrangePhantom(), 200, map.getHeight() - 140);

        return map;
    }

    void addWalls(Map map)
    {
        int x=0;
        int y=50;
        int murox=300;
        int muroy=150;
        int i,f;
     
        
        for(i=0;i<=15;i++ )
        {
        map.addObject(new Wall(), x, 50);
        x+=50;
        }
        
        for(i=0;i<=10;i++ )
        {
        map.addObject(new Wall(), murox, muroy);
        muroy+=50;
        }
        
         for(i=0;i<=10;i++ )
        {
        map.addObject(new Wall(), 400, 400);
        muroy+=50;
        }
        
        map.addObject(new Wall(), 300, 150);
        map.addObject(new Wall(), 300, 200);
        map.addObject(new Wall(), 300, 250);
        map.addObject(new Wall(), 300, 400);
        map.addObject(new Wall(), 300, 450);
        map.addObject(new Wall(), 300, 500);

        map.addObject(new Wall(), 35, 650);
        map.addObject(new Wall(), 400, 650);
        map.addObject(new Wall(), 450, 650);
        map.addObject(new Wall(), 500, 650);
        map.addObject(new Wall(), 550, 650);
        map.addObject(new Wall(), 600, 650);
        map.addObject(new Wall(), 650, 650);
        map.addObject(new Wall(), 700, 650);
        map.addObject(new Wall(), 750, 650);
        
        map.addObject(new Wall(), 750, 150);
        map.addObject(new Wall(), 750, 200);
        map.addObject(new Wall(), 750, 250);
        map.addObject(new Wall(), 750, 400);
        map.addObject(new Wall(), 750, 450);
        map.addObject(new Wall(), 750, 500);
        map.addObject(new Wall(), 750, 550);
        map.addObject(new Wall(), 750, 600);
        map.addObject(new Wall(), 750, 650);


    }

    void addSmallItems(Map map)
    {
        for(int x = 50; x < 600; x+=70) {
            map.addObject(new SmallPoint(), x,  map.getHeight()-90);
        }
        for(int x = 50; x < 600; x+=70) {
            map.addObject(new SmallPoint(), x,  90);
        }
    }

    void addPowerItems(Map map)
    {
        map.addObject(new PowerPoint(), 95, 90);
        map.addObject(new PowerPoint(), map.getWidth()-95, 90);
        map.addObject(new PowerPoint(), 100, map.getHeight()-90);
        map.addObject(new PowerPoint(), map.getWidth()-100, map.getHeight()-90);

    }

}
