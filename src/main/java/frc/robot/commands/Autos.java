// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import frc.robot.subsystems.DriveSubsystem;

public final class Autos {
  // Drive forward forever until A-Stopped
  public static Command driveAuto(DriveSubsystem driveSubsystem) {
    return new RunCommand(
        () -> driveSubsystem.drive(
            0.5, 0, 0,
            true),
        driveSubsystem);
  }

  private Autos() {
    throw new UnsupportedOperationException("This is a utility class!");
  }
}
