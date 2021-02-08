package fit;

import fit.core.Airplane;
import fit.core.GliderFactory;
import fit.core.JetFactory;
import fit.core.MotorizedAirplane;
import fit.core.MotorizedAirplaneFactory;
import fit.core.Pilot;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Implementing DIP!" );

        Airplane motorized = new MotorizedAirplaneFactory().build();
        Airplane glider = new GliderFactory().build();
        Airplane jet = new JetFactory().build();

        var pilot = new Pilot();

        pilot.fly(motorized);
        pilot.fly(glider);
        pilot.fly(jet);
    }
}
