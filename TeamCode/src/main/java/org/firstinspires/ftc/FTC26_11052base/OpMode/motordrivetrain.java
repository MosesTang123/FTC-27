package org.firstinspires.ftc.FTC26_11052base.OpMode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;


public class motordrivetrain {

    private DcMotor left ,right;


    public void init(HardwareMap hw, OpMode opMode){
        left=hw.get(DcMotorEx.class,"left");
        left.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        right=hw.get(DcMotorEx.class,"right");
        right.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        left.setDirection(DcMotor.Direction.FORWARD);
        right.setDirection(DcMotor.Direction.REVERSE);
        left.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        right.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

    }
    public void drive (double spd, double spin){
    double leftpower =spd+spin;
    double rightpower =spd-spin;

        left.setPower(leftpower);
        right.setPower(rightpower);





    }



}
