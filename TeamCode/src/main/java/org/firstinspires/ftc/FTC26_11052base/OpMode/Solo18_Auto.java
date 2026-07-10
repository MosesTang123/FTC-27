//package org.firstinspires.ftc.FTC26_11052.OpMode;
//
//import com.bylazar.telemetry.PanelsTelemetry;
//import com.bylazar.telemetry.TelemetryManager;
//import com.pedropathing.follower.Follower;
//import com.pedropathing.geometry.BezierCurve;
//import com.pedropathing.geometry.BezierLine;
//import com.pedropathing.geometry.Pose;
//import com.pedropathing.paths.PathChain;
//import com.pedropathing.util.Timer;
//import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//
////import org.firstinspires.ftc.FTC26_11052.pedroPathing.Constants;
//
//@Autonomous
//public class Solo18_Auto extends LinearOpMode{
//    TelemetryManager panelsTelemetry = PanelsTelemetry.INSTANCE.getTelemetry();
//    Timer pathTimer=new Timer(),opmodeTimer=new Timer();
//    private int pathState;
//    private Follower follower;
//    private final Pose startpos=new Pose(112.000,136.000,Math.toRadians(0));
//    private final Pose endpos=new Pose(125.000,70.000,Math.toRadians(270));
//    private final Pose shootpos=new Pose(91.000,84.000);
//    private final Pose firstrowpos=new Pose(120.000,84.000);
//    private final Pose secondrowpos=new Pose(120.000, 60.000);
//    private final Pose thirdrowpos=new Pose(120.000, 35.500);
//    private final Pose gatepos=new Pose(133.500,60.000,Math.toRadians(40));
//    PathChain Path1,Path2,Path3,Path4,Path5,Path6,Path7,Path8,Path9,Path10,Path11,End;
//    public void buildPaths(){
//        Path1 = follower.pathBuilder()
//                .addPath(new BezierLine(startpos,shootpos))
//                .setLinearHeadingInterpolation(startpos.getHeading(), Math.toRadians(0))
//                .build();
//        Path2 = follower.pathBuilder()
//                .addPath(new BezierCurve(shootpos,new Pose(89.241, 55.667),secondrowpos))
//                .setLinearHeadingInterpolation(Math.toRadians(0), Math.toRadians(0))
//                .build();
//        Path3 = follower.pathBuilder()
//                .addPath(new BezierLine(secondrowpos,shootpos))
//                .setLinearHeadingInterpolation(Math.toRadians(0), Math.toRadians(0))
//                .build();
//        Path4 = follower.pathBuilder()
//                .addPath(new BezierLine(shootpos,gatepos))
//                .setLinearHeadingInterpolation(Math.toRadians(0),gatepos.getHeading())
//                .build();
//        Path5 = follower.pathBuilder()
//                .addPath(new BezierLine(gatepos,shootpos))
//                .setLinearHeadingInterpolation(gatepos.getHeading(), Math.toRadians(40))
//                .build();
//        Path6 = follower.pathBuilder()
//                .addPath(new BezierLine(shootpos,gatepos))
//                .setLinearHeadingInterpolation(Math.toRadians(40),gatepos.getHeading())
//                .build();
//        Path7 = follower.pathBuilder()
//                .addPath(new BezierLine(gatepos,shootpos))
//                .setLinearHeadingInterpolation(gatepos.getHeading(), Math.toRadians(0))
//                .build();
//        Path8 = follower.pathBuilder()
//                .addPath(new BezierLine(shootpos,firstrowpos))
//                .setLinearHeadingInterpolation(Math.toRadians(0), Math.toRadians(0))
//                .build();
//        Path9 = follower.pathBuilder()
//                .addPath(new BezierLine(firstrowpos,shootpos))
//                .setLinearHeadingInterpolation(Math.toRadians(0), Math.toRadians(0))
//                .build();
//        Path10 = follower.pathBuilder()
//                .addPath(new BezierCurve(shootpos,new Pose(92.278, 32.904),thirdrowpos))
//                .setLinearHeadingInterpolation(Math.toRadians(0), Math.toRadians(0))
//                .build();
//        Path11 = follower.pathBuilder()
//                .addPath(new BezierLine(thirdrowpos,shootpos))
//                .setLinearHeadingInterpolation(Math.toRadians(0), Math.toRadians(0))
//                .build();
//        End = follower.pathBuilder()
//                .addPath(new BezierLine(shootpos,endpos))
//                .setLinearHeadingInterpolation(Math.toRadians(0),endpos.getHeading())
//                .build();
//    }
//    public void autonomousPathUpdate(){
//        switch(pathState){
//            case 0:
//                follower.followPath(Path1);
//                setPathState(1);
//                break;
//            case 1:
//                if(!follower.isBusy()){
//                    follower.followPath(Path2);
//                    setPathState(2);
//                    break;
//                }
//        }
//    }
//    public void setPathState(int State){
//        pathState=State;
//        pathTimer.resetTimer();
//    }
//
//    @Override
//    public void runOpMode(){
// //       follower=Constants.createFollower(hardwareMap);
//        buildPaths();
//        follower.setStartingPose(startpos);
//
//        pathTimer.resetTimer();
//        opmodeTimer.resetTimer();
//
//        panelsTelemetry.addLine("Solo18_Auto");
//        panelsTelemetry.addLine("Status: Initialized");
//        panelsTelemetry.update(telemetry);
//
//        resetRuntime();
//        waitForStart();
//        while(opModeIsActive()){
//            panelsTelemetry.addLine("Solo18_Auto");
//            panelsTelemetry.addLine("Status: Running");
//            panelsTelemetry.addData("Path State: ",pathState);
//            panelsTelemetry.update(telemetry);
//
//            follower.update();
//            autonomousPathUpdate();
//        }
//    }
//}
