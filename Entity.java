import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

class Entity {

    private double health;
    private double maxHealth;
    private boolean alive = true;
    HashMap<String,double>(); resistances = new HashMap<>();

    public Entity( double maxHealth ){

        this.maxHealth = maxHealth;
        this.setHealth(maxHealth);

    }

    public double getHealth(){return this.health;}
    public void setHealth(double health){
        this.health = health;
    }


    public double getMaxHealth() {return maxHealth;}
    public void setMaxHealth(double maxHealth) {
        this.maxHealth = maxHealth;
    }


    public void takeDamage(double amount, String type ){

        double damage = amount;


        setHealth( this.health - damage );

        if( health < 0 ){
            setHealth(0);
            alive = false;
        }
    }

}