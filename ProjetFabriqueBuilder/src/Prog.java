
import ch.comem.fab.CarBuilderDirectorUK;
import ch.comem.fab.CarBuilder;
import ch.comem.fab.CarBuilderImpl;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dylan
 */
public class Prog {
        public static void main(final String[] arguments) {
        CarBuilder builder = new CarBuilderImpl();
        CarBuilderDirectorUK carBuildDirectorUK = new CarBuilderDirectorUK(builder);
        System.out.println(carBuildDirectorUK.construct());
    }
}

//je test
//Je test derrière Dylan
