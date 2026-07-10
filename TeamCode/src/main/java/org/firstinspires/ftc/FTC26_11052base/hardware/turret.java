//package org.firstinspires.ftc.FTC26_11052.hardware;
//
//import com.bylazar.telemetry.PanelsTelemetry;
//import com.bylazar.telemetry.TelemetryManager;
//import com.pedropathing.follower.Follower;
//import com.pedropathing.geometry.Pose;
//import com.pedropathing.math.MathFunctions;
//import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.hardware.DcMotorEx;
//import com.qualcomm.robotcore.hardware.HardwareMap;
//import com.qualcomm.robotcore.util.ElapsedTime;
//
//public class turret{
//    ElapsedTime timer = new ElapsedTime();
//    TelemetryManager panelsTelemetry = PanelsTelemetry.INSTANCE.getTelemetry();
//    public DcMotorEx turretmotor;
//    HardwareMap _hw;
//    private double integralsum=0,lasterror=0;
//    public void init(HardwareMap hw){
//        _hw=hw;
//        turretmotor=_hw.get(DcMotorEx.class,"turretmotor");
//        turretmotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        turretmotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
//    }
//    public double pidfoutput(double reference){
//        double error=reference-turretmotor.getCurrentPosition();
//        integralsum=error*timer.seconds();
//        double derivative=(error-lasterror)/timer.seconds();
//        lasterror=error;
//        timer.reset();
//        return MathFunctions.clamp((error*0.05)+(derivative*0.00006)+(integralsum*0)+0.1,-1,1);
//    }
//    public void track(Pose robotpos, Pose goal){
////        double x=follower.getPose().getX();
////        double y=follower.getPose().getY();
////        double heading=follower.getPose().getHeading();
////        double degpertick=Math.round(537.7*3/360);
////        double deltaX=goalx-x;
////        double deltaY=goaly-y;
////
//    }
//}