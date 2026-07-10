//package org.firstinspires.ftc.FTC26_11052.hardware;
//
//import com.pedropathing.math.MathFunctions;
//import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.hardware.DcMotorEx;
//import com.qualcomm.robotcore.hardware.DcMotorSimple;
//import com.qualcomm.robotcore.hardware.HardwareMap;
//import com.qualcomm.robotcore.hardware.IMU;
//
//import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
//
//public class MecanumDrive{
//    private LinearOpMode opMode;
//    private DcMotorEx Lfront,Rfront,Lback,Rback;
// //   private IMU imu;
//    private HardwareMap _hw;
//
//    public void init(HardwareMap hw, LinearOpMode currmode, DcMotor.ZeroPowerBehavior zeroPowerBehavior){
//        _hw=hw;
//        opMode=currmode;
//        Lfront=_hw.get(DcMotorEx.class,"Lfront");
//        Rfront=_hw.get(DcMotorEx.class,"Rfront");
//        Lback=_hw.get(DcMotorEx.class,"Lback");
//        Rback=_hw.get(DcMotorEx.class,"Rback");
//        Rback.setDirection(DcMotorSimple.Direction.REVERSE);
//        Rfront.setDirection(DcMotorSimple.Direction.REVERSE);
//        Lfront.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
//        Lback.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
//        Rfront.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
//        Rback.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
//        Lfront.setZeroPowerBehavior(zeroPowerBehavior);
//        Rfront.setZeroPowerBehavior(zeroPowerBehavior);
//        Lback.setZeroPowerBehavior(zeroPowerBehavior);
//        Rback.setZeroPowerBehavior(zeroPowerBehavior);
////        imu=_hw.get(IMU.class,"imu");
////        RevHubOrientationOnRobot HubOrientation = new RevHubOrientationOnRobot(RevHubOrientationOnRobot.LogoFacingDirection.LEFT, RevHubOrientationOnRobot.UsbFacingDirection.UP);
////        imu.initialize(new IMU.Parameters(HubOrientation));
////        imu.resetYaw();
//    }
//    public void RobotCentric(){
//        double tardir=Math.atan2(-opMode.gamepad1.left_stick_y,opMode.gamepad1.left_stick_x);
//        tardir-=(Math.PI/4);
//        double tarpow=Math.hypot(opMode.gamepad1.left_stick_x,-opMode.gamepad1.left_stick_y);
//        double turn=opMode.gamepad1.right_stick_x;
//        double sincal=Math.sin(tardir);
//        double coscal=Math.cos(tardir);
//        double powmax=Math.max(Math.abs(sincal),Math.abs(coscal));
//        double lfpow=tarpow*coscal/powmax+turn;
//        double rfpow=tarpow*sincal/powmax-turn;
//        double lbpow=tarpow*sincal/powmax+turn;
//        double rbpow=tarpow*coscal/powmax-turn;
//        if((tarpow+Math.abs(turn))>1){
//            lfpow/=tarpow+turn;
//            rfpow/=tarpow+turn;
//            lbpow/=tarpow+turn;
//            rbpow/=tarpow+turn;
//        }
//        Lfront.setPower(MathFunctions.clamp(lfpow,-1,1));
//        Rfront.setPower(MathFunctions.clamp(rfpow,-1,1));
//        Lback.setPower(MathFunctions.clamp(lbpow,-1,1));
//        Rback.setPower(MathFunctions.clamp(rbpow,-1,1));
//    }
////    public void FieldCentric(){
////        if(opMode.gamepad1.left_stick_button)imu.resetYaw();
////        double heading=imu.getRobotYawPitchRollAngles().getYaw(AngleUnit.RADIANS);
////        double tardir=Math.atan2(-opMode.gamepad1.left_stick_y,opMode.gamepad1.left_stick_x);
////        tardir-=(Math.PI/4)+heading;
////        double tarpow=Math.hypot(opMode.gamepad1.left_stick_x,-opMode.gamepad1.left_stick_y);
////        double turn=opMode.gamepad1.right_stick_x;
////        double sincal=Math.sin(tardir);
////        double coscal=Math.cos(tardir);
////        double powmax=Math.max(Math.abs(sincal),Math.abs(coscal));
////        double lfpow=tarpow*coscal/powmax+turn;
////        double rfpow=tarpow*sincal/powmax-turn;
////        double lbpow=tarpow*sincal/powmax+turn;
////        double rbpow=tarpow*coscal/powmax-turn;
////        if((tarpow+Math.abs(turn))>1){
////            lfpow/=tarpow+turn;
////            rfpow/=tarpow+turn;
////            lbpow/=tarpow+turn;
////            rbpow/=tarpow+turn;
////        }
////        Lfront.setPower(MathFunctions.clamp(lfpow,-1,1));
////        Rfront.setPower(MathFunctions.clamp(rfpow,-1,1));
////        Lback.setPower(MathFunctions.clamp(lbpow,-1,1));
////        Rback.setPower(MathFunctions.clamp(rbpow,-1,1));
////    }
//}
