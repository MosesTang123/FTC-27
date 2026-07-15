package org.firstinspires.ftc.FTC26_11052base.OpMode;


import com.pedropathing.math.MathFunctions;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class
motorservo {

    public DcMotor shooter;

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
        shooter=hw.get(DcMotor.class,"shooter");
        shooter.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

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

