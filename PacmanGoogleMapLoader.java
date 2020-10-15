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
        
        PacMan pacMan = new PacMan();
               
        map.addObject(pacMan, 100, 100);
        
        return map;
    }
}
