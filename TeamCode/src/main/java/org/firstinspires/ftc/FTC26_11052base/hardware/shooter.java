//package org.firstinspires.ftc.FTC26_11052.hardware;
//
//import com.pedropathing.geometry.Pose;
//import com.pedropathing.math.MathFunctions;
//import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.hardware.DcMotor.ZeroPowerBehavior;
//import com.qualcomm.robotcore.hardware.DcMotorEx;
//import com.qualcomm.robotcore.hardware.HardwareMap;
//import com.qualcomm.robotcore.hardware.Servo;
//import com.qualcomm.robotcore.util.ElapsedTime;
//
//public class shooter{
//    ElapsedTime timer = new ElapsedTime();
//    HardwareMap _hw;
//    public DcMotorEx shooter1,shooter2;
////    public Servo adjust;
//    private static double integralsum=0,lasterror=0;
//
//    public void init(HardwareMap hw){
//        _hw=hw;
//        shooter1=_hw.get(DcMotorEx.class,"shooter1");
////        shooter2=_hw.get(DcMotorEx.class,"shooter2");
//        shooter1.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
//        shooter1.setZeroPowerBehavior(ZeroPowerBehavior.FLOAT);
////        shooter2.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
////        shooter2.setZeroPowerBehavior(ZeroPowerBehavior.FLOAT);
////     adjust=_hw.servo.get("adjust");
////        adjust.setPosition(0);
//    }
////    double kp, double ki ,double kd ,double kf ,double ks ,
//    public void run( double reference){
//        double error=reference-shooter1.getVelocity();
//        integralsum=error*timer.seconds();
//        double derivative=(error-lasterror)/timer.seconds();
//        lasterror=error;
//        timer.reset();
//        double power=MathFunctions.clamp((error*0.00049)+(derivative*0)+(integralsum*0)+(reference*0.01)+0.18  ,-1,1);
////        shooter1.setPower(power);
//        shooter2.setPower(power);
//    }
////    public double goaldis(Pose robotpos){
////            return (Math.sqrt(Math.pow(Math.abs(185-robotpos.getX()),2)+Math.pow(Math.abs(185-robotpos.getY()),2)))*2.54;
// //   }
////    public double getVelocity(Pose robotpos){
////        double goaldistance=goaldis(robotpos);
////        double velocity=(0.0000122133*Math.pow(goaldistance,3))+(-0.00842135*Math.pow(goaldistance,2))+(4.65315*goaldistance)+830.94999;
////        return velocity;
////    }
////    public double getAngle(Pose robotpos){
////        double goaldistance=goaldis(robotpos);
////        double angle=(0.0000000178443*Math.pow(goaldistance,3))-(-0.0000106754*Math.pow(goaldistance,2))+(0.0045735*goaldistance)-0.346747;
////        return angle;
////    }
//}