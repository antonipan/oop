package level_7.Ex004.Robot;

public class Program {
    public static void main(String[] args) {
////         #region Robot1 demo
//
//          Robot1 robot1 = new Robot1("Verder", 100);
//
//
//         robot1.level = 100500;
//         System.out.printf("%s %d\n", robot1.name, robot1.level);
//
//         //#endregion
//
//         // #region processing
//
//         robot1.startBIOS();
//         robot1.startOS();
//         robot1.sayHi();
//
//         robot1.work();
//
//         robot1.sayBye();
//         robot1.stopOS();
//         robot1.stopBIOS();
//
//         // #endregion
//
//        System.out.println();
        // #endregion

        // #region Robo2 demo

//         Robot2 robot2 = new Robot2("Robbi", 3);
//
//         System.out.printf("%s %d\n",
//         robot2.getName(), robot2.getLevel());
//
//         robot2.work();
//         robot2.work();
//         robot2.work();
//         robot2.powerOff();

        // #endregion

        //#region Robo3 demo

        Robot3 robot3 = new Robot3();
        System.out.println("-------------");
        System.out.println(robot3);
        robot3.power();
        robot3.work();
        robot3.power();
        robot3.work();

        robot3.power();
        robot3.work();
        robot3.work();
        System.out.println(robot3.getName());
        Robot3 robot32 = new Robot3();
        Robot3 robot31 = new Robot3();
        System.out.println(robot31.getName());
        System.out.println(robot32.getName() + " " + robot32.getLevel());

        //#endregion
    }

}
