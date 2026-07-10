//package org.firstinspires.ftc.FTC26_11052.hardware;
//
//import com.pedropathing.math.MathFunctions;
//import com.qualcomm.robotcore.eventloop.opmode.OpMode;
//import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.hardware.DcMotorEx;
//import com.qualcomm.robotcore.hardware.DistanceSensor;
//import com.qualcomm.robotcore.hardware.HardwareMap;
//import com.qualcomm.robotcore.hardware.Servo;
//import com.qualcomm.robotcore.util.ElapsedTime;
//
//import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
//
//public class intake{
//
//    HardwareMap _hw;
//    public DcMotorEx intake;
//
//    double integralsum=0,lasterror=0,Intaketar=2300;
//    boolean Intakeopen=true,shooting=false;
//    private OpMode currmode;
//    public void init(HardwareMap hw,OpMode opMode){
//        _hw=hw;
//        currmode=opMode;
//        intake=_hw.get(DcMotorEx.class,"intake");
//        intake.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
////        intake.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
////        stopper=_hw.servo.get("stopper");
////        stopper.setPosition(0);
////        full=_hw.get(DistanceSensor.class,"full");
//    }
////    public void run(double reference){
////        double error=reference-intake.getVelocity();
////        integralsum=error*timer.seconds();
////        double derivative=(error-lasterror)/timer.seconds();
////        lasterror=error;
////        timer.reset();
////        intake.setPower(MathFunctions.clamp((error*0.00001)+(derivative*0)+(integralsum*0)+(reference*0.00048)+0.2,-1,1));
////    }
////    public void IntakeAuto(){
////        if(currmode.gamepad1.rightBumperWasPressed()&&!shooting){
////            shooting=true;
////    //        stopper.setPosition(0.35);
////            systemtimer.reset();
////        }
////        else if(shooting){
////            if(systemtimer.milliseconds()>300)Intakeopen=true;
////            if(currmode.gamepad2.leftBumperWasPressed())shooting=false;
////        }
////
////        else if(currmode.gamepad1.leftBumperWasPressed())Intakeopen=!Intakeopen;
////        else if(currmode.gamepad1.left_trigger_pressed)Intaketar=Intaketar*-1;
////        else if(Intakeopen&&fullcheck())Intakeopen=false;
////        if(Intakeopen)run(Intaketar);
////        else intake.setPower(0);
//
//      //  if(currmode.gamepad1.leftTriggerWasPressed()){
//     //       stopper.setPosition(0);
//      //      shooting=false;
//     //   }
//
//    }
////    public boolean fullcheck(){
////        if(full.getDistance(DistanceUnit.CM)>=13.5)fulltimer.reset();
////        return fulltimer.milliseconds()>=500;
////    }
////}
//
//
//
//
