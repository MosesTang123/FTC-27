package org.firstinspires.ftc.FTC26_11052base.OpMode;



import com.pedropathing.math.MathFunctions;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

public class
motorservo {

    public DcMotorEx shooter;

    public DcMotor intake;
    public Servo transfer;
    public Servo blocker;
    public Servo blocker2;
    public Servo blocker3;
    //public DcMotor blockerm;
    private OpMode opMode;

    public void init (HardwareMap hw, OpMode opMode){
        this.opMode = opMode;

        intake=hw.get(DcMotor.class,"intake");
        intake.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        shooter=hw.get(DcMotorEx.class,"shooter");
        shooter.setMode(DcMotorEx.RunMode.RUN_WITHOUT_ENCODER);
       // shooter.setMode(DcMotorEx.RunMode.RUN_USING_ENCODER);//pid

//        transfer=hw.servo.get("transfer");
//        transfer.setPosition(0);
//        blocker=hw.servo.get("blocker");
//        blocker.setPosition(0);
//
//        blocker2=hw.servo.get("blocker2");blocker2.setPosition(0);
        blocker3=hw.servo.get("blocker3");


        blocker3.setPosition(0);
    }
    public void intake(double speed){
        if (opMode.gamepad1.right_bumper) {
            intake.setPower(speed);
        }
        else {
            intake.setPower(0);
        }


}
    public void shooter (double power){
        if (opMode.gamepad1.left_bumper) {
            shooter.setPower(MathFunctions.clamp(power,-1,1));
        }
        else {
            shooter.setPower(0);
        }
    }

//    public void pidshooter(double kp, double ki ,double kd ,double kf ,double ks ,double reference){
//
//         double integralsum=0,lasterror=0;
//        ElapsedTime timer = new ElapsedTime();
//        double error=reference-shooter.getVelocity();
//        integralsum=error*timer.seconds();
//        double derivative=(error-lasterror)/timer.seconds();
//        lasterror=error;
//        timer.reset();
//        double power=MathFunctions.clamp((error*0.00049)+(reference*0.01)+0.18  ,-1,1);
//      //  (derivative*0)+(integralsum*0)+
//       shooter.setPower(power);
//
//    }






    
//public void servo1 (double pos){
//    if (opMode.gamepad1.a) {
//        transfer.setPosition(pos);
//    }
//    else {
//        transfer.setPosition(0);
//    }
//    }
//
// public void servo2 (double pos1,double pos2 ){
//        if (opMode.gamepad1.b) {
//            blocker.setPosition(pos1);
//            blocker2.setPosition(pos2);
//        }
//        else {
//            blocker.setPosition(0);
//            blocker2.setPosition(0);
//        }
//
//        }
    public void servo3 ( double pos3){
         if (opMode.gamepad1.b) {
            blocker3.setPosition(0);
        }
        else {
            blocker3.setPosition(pos3);
        }

    }
}

