package org.firstinspires.ftc.FTC26_11052base.OpMode;
import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.pedropathing.math.MathFunctions;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.IMU;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;

public class mecanum  {
    private DcMotor Lfront,Rfront,Lback,Rback;
    double lfpwr,rfpwr,lbpwr,rbpwr;
    private IMU imu;

    public void init(HardwareMap hw){

        Lfront=hw.get(DcMotor.class,"Lfront");
        Rfront=hw.get(DcMotor.class,"Rfront");
        Lback=hw.get(DcMotor.class,"Lback");
        Rback=hw.get(DcMotor.class,"Rback");
        Rback.setDirection(DcMotor.Direction.REVERSE);
        Rfront.setDirection(DcMotor.Direction.REVERSE);
        Lfront.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        Lback.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        Rfront.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        Rback.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        Lfront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        Rfront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        Lback.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        Rback.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        imu = hw.get(IMU.class,"IMU");
        RevHubOrientationOnRobot revor =new RevHubOrientationOnRobot(
                RevHubOrientationOnRobot.LogoFacingDirection.LEFT,//TBC
                RevHubOrientationOnRobot.UsbFacingDirection.UP//TBC
        )
        imu.initialize(new IMU.Parameters(revor));
    }
    public void drive1 (double drive, double strafe, double turn){

        lfpwr=drive+turn+strafe;
        lbpwr=drive-turn-strafe;
        rfpwr=drive+turn-strafe;
        rbpwr=drive-turn+strafe;

        Lfront.setPower(MathFunctions.clamp(lfpwr,-1,1));
        Rfront.setPower(MathFunctions.clamp(rfpwr,-1,1));
        Lback.setPower(MathFunctions.clamp(lbpwr,-1,1));
        Rback.setPower(MathFunctions.clamp(rbpwr,-1,1));

    }

    public void drivebetter (double drive, double strafe, double turn){
        double theta =Math.atan2(drive,strafe);
        double r = Math.hypot(strafe,drive);

        theta= AngleUnit.normalizeRadians(theta-imu.getRobotYawPitchRollAngles(AngleUnit.RADIANS));

        double ndrive=r*Math.sin(theta);
        double nstrafe=r*Math.cos(theta);

        this.drive1(ndrive,nstrafe,turn);

    }

}
