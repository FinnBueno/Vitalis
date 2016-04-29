package com.teamvitalis.vitalis.utils;

import org.bukkit.util.Vector;

public class VectorUtils {

	private VectorUtils() {
	}

	public static Vector rotateAroundX(Vector v, double angle) {
		angle = Math.toRadians(angle);
		double cos = Math.cos(angle);
		double sin = Math.sin(angle);
		double y = v.getY() * cos - v.getZ() * sin;
		double z = v.getY() * sin + v.getZ() * cos;
		return v.setY(y).setZ(z);
	}

	public static Vector rotateAroundY(Vector v, double angle) {
		angle = Math.toRadians(angle);
		double cos = Math.cos(angle);
		double sin = Math.sin(angle);
		double x = v.getX() * cos + v.getZ() * sin;
		double z = v.getX() * -sin + v.getZ() * cos;
		return v.setX(x).setZ(z);
	}

	public static Vector rotateAroundZ(Vector v, double angle) {
		angle = Math.toRadians(angle);
		double cos = Math.cos(angle);
		double sin = Math.sin(angle);
		double x = v.getX() * cos - v.getY() * sin;
		double y = v.getX() * sin + v.getY() * cos;
		return v.setX(x).setY(y);
	}

}