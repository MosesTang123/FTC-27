package org.firstinspires.ftc.FTC26_11052base.OpMode;

import com.bylazar.telemetry.PanelsTelemetry;
import com.bylazar.telemetry.TelemetryManager;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import org.firstinspires.ftc.FTC26_11052base.hardware.MecanumDrive;
@TeleOp(name = "IDK2 Fixed")
public class main extends OpMode {

    TelemetryManager panelsTelemetry = PanelsTelemetry.INSTANCE.getTelemetry();

   // MecanumDrive drive = new MecanumDrive();
     mecanum drive1 = new mecanum();
    motorservo motorservo = new motorservo();
    //twomotordrivetrain drive = new twomotordrivetrain();

    //blocker blockerm = new blocker();
    double pwr=0.5;


    @Override
    public void init() {

        motorservo.init(hardwareMap,this );
     //   drive.init(hardwareMap,this);
      drive1.init(hardwareMap);
  //    blockerm.init(hardwareMap,this);
    }

    @Override
    public void loop () {

        motorservo.intake(-1);


     //   motorservo.servo1(0.15);
       // motorservo.servo2(0.35,0.35);
        motorservo.servo3(0.35);

      //  drive.drive(-gamepad1.left_stick_y, gamepad1.left_stick_x);
        drive1.drive1(-gamepad1.left_stick_y,gamepad1.left_stick_x,gamepad1.right_stick_x);
      //  drive.FieldCentric();
        if (gamepad1.dpadUpWasPressed() ) {
            pwr += 0.1;
            panelsTelemetry.update(telemetry);

        }
        if (gamepad1.dpadDownWasPressed() ) {
            pwr -= 0.1;
            panelsTelemetry.update(telemetry);

        }
        motorservo.shooter(pwr);

//        blockerm.updateBlocker(0.75, 0.5);
//
//        // Add telemetry to see what the motor is doing
//        telemetry.addData("Blocker Target Ticks", blockerm.blockerMotor.getTargetPosition());
//        telemetry.addData("Blocker Current Ticks", blockerm.blockerMotor.getCurrentPosition());

        panelsTelemetry.addData("ShooterPower ",motorservo.shooter.getPower());
        panelsTelemetry.update(telemetry);


    }



}



