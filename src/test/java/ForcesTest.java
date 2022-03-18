import static org.junit.Assert.*;
import org.junit.Test;

public class ForcesTest {
    @Test
    public void Test_Forces(){
        Forces forces = new Forces();
        forces.addForces(4, 1, 7);
        forces.addForces(-2, 4, -1);
        forces.addForces(1, -5, -3);
        String res = forces.Check();
        System.out.println("The Summation of Forces is : "+forces.Forces[0]+" "+forces.Forces[1]+" "+forces.Forces[2]+" "+", The Result is: "+res);
        assertEquals("NO",res);

        forces = new Forces();
        forces.addForces(3, -1, 7);
        forces.addForces(-5, 2, -4);
        forces.addForces(2, -1, -3);
        res = forces.Check();
        System.out.println("The Summation of Forces is : "+forces.Forces[0]+" "+forces.Forces[1]+" "+forces.Forces[2]+" "+", The Result is: "+res);
        assertEquals("YES",res);

        forces = new Forces();
        forces.addForces(68, 3, 100);
        forces.addForces(68, 21, -100);
        forces.addForces(-100, -24, 0);
        forces.addForces(-36, 0, 0);
        res = forces.Check();
        System.out.println("The Summation of Forces is : "+forces.Forces[0]+" "+forces.Forces[1]+" "+forces.Forces[2]+" "+", The Result is: "+res);
        assertEquals("YES",res);

        forces = new Forces();
        forces.addForces(1, 2, 3);
        forces.addForces(3, 2, 1);
        forces.addForces(0, 0, 0);
        res = forces.Check();
        System.out.println("The Summation of Forces is : "+forces.Forces[0]+" "+forces.Forces[1]+" "+forces.Forces[2]+" "+", The Result is: "+res);
        assertEquals("NO",res);

        forces = new Forces();
        forces.addForces(5, -23, 12);
        forces.addForces(0, 0, 0);
        res = forces.Check();
        System.out.println("The Summation of Forces is : "+forces.Forces[0]+" "+forces.Forces[1]+" "+forces.Forces[2]+" "+", The Result is: "+res);
        assertEquals("NO",res);

        forces = new Forces();
        forces.addForces(0, 0, 0);
        res = forces.Check();
        System.out.println("The Summation of Forces is : "+forces.Forces[0]+" "+forces.Forces[1]+" "+forces.Forces[2]+" "+", The Result is: "+res);
        assertEquals("YES",res);

        forces = new Forces();
        forces.addForces(1, -2, 0);
        res = forces.Check();
        System.out.println("The Summation of Forces is : "+forces.Forces[0]+" "+forces.Forces[1]+" "+forces.Forces[2]+" "+", The Result is: "+res);
        assertEquals("NO",res);

        forces = new Forces();
        forces.addForces(-23, 77, -86);
        forces.addForces(23, -77, 86);
        res = forces.Check();
        System.out.println("The Summation of Forces is : "+forces.Forces[0]+" "+forces.Forces[1]+" "+forces.Forces[2]+" "+", The Result is: "+res);
        assertEquals("YES",res);

        forces = new Forces();
        forces.addForces(96, 49, -12);
        forces.addForces(2, -66, 28);
        forces.addForces(-98, 17, -16);
        res = forces.Check();
        System.out.println("The Summation of Forces is : "+forces.Forces[0]+" "+forces.Forces[1]+" "+forces.Forces[2]+" "+", The Result is: "+res);
        assertEquals("YES",res);

        forces = new Forces();
        forces.addForces(70, -46, 86);
        forces.addForces(-100, 94, 24);
        forces.addForces(-27, 63, -63);
        forces.addForces(57, -100, -47);
        forces.addForces(0, -11, 0);
        res = forces.Check();
        System.out.println("The Summation of Forces is : "+forces.Forces[0]+" "+forces.Forces[1]+" "+forces.Forces[2]+" "+", The Result is: "+res);
        assertEquals("YES",res);

        forces = new Forces();
        forces.addForces(0, 2, -2);
        forces.addForces(1, -1, 3);
        forces.addForces(-3, 0, 0);
        res = forces.Check();
        System.out.println("The Summation of Forces is : "+forces.Forces[0]+" "+forces.Forces[1]+" "+forces.Forces[2]+" "+", The Result is: "+res);
        assertEquals("NO",res);

        forces = new Forces();
        forces.addForces(1,7,9);
        forces.addForces(2,9,1);
        forces.addForces(5,5,1);
        res = forces.Check();
        System.out.println("The Summation of Forces is : "+forces.Forces[0]+" "+forces.Forces[1]+" "+forces.Forces[2]+" "+", The Result is: "+res);
        assertEquals("NO",res);

        forces = new Forces();
        forces.addForces(0,1,0);
        forces.addForces(0,-1,0);
        forces.addForces(1,0,0);
        forces.addForces(-1,0,0);
        res = forces.Check();
        System.out.println("The Summation of Forces is : "+forces.Forces[0]+" "+forces.Forces[1]+" "+forces.Forces[2]+" "+", The Result is: "+res);
        assertEquals("YES",res);

        forces = new Forces();
        forces.addForces(1,2,3);
        forces.addForces(3,2,1);
        forces.addForces(-1,2,1);
        res = forces.Check();
        System.out.println("The Summation of Forces is : "+forces.Forces[0]+" "+forces.Forces[1]+" "+forces.Forces[2]+" "+", The Result is: "+res);
        assertEquals("NO",res);

        forces = new Forces();
        forces.addForces(5,4,2);
        forces.addForces(3,6,3);
        forces.addForces(1,5,8);
        forces.addForces(1,7,3);
        res = forces.Check();
        System.out.println("The Summation of Forces is : "+forces.Forces[0]+" "+forces.Forces[1]+" "+forces.Forces[2]+" "+", The Result is: "+res);
        assertEquals("NO",res);

        forces = new Forces();
        forces.addForces(9,9,9);
        forces.addForces(-9,-9,-9);
        forces.addForces(0,0,0);
        res = forces.Check();
        System.out.println("The Summation of Forces is : "+forces.Forces[0]+" "+forces.Forces[1]+" "+forces.Forces[2]+" "+", The Result is: "+res);
        assertEquals("YES",res);

        forces = new Forces();
        forces.addForces(1,1,1);
        forces.addForces(2,2,2);
        forces.addForces(-2,-3,-4);
        forces.addForces(0,0,0);
        res = forces.Check();
        System.out.println("The Summation of Forces is : "+forces.Forces[0]+" "+forces.Forces[1]+" "+forces.Forces[2]+" "+", The Result is: "+res);
        assertEquals("NO",res);
    }
}
