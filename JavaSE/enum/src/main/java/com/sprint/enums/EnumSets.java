package com.sprint.enums;

import java.util.*;
import static com.sprint.enums.Activity.*;
public class EnumSets {
	public static void testEnumSet() { //EnumSet不能放带参数的实例吗?
		EnumSet<Activity> points = EnumSet.noneOf(Activity.class);
		points.add(RUNNING);
		System.out.println(points);	
		points.addAll(EnumSet.of(LYING));
		System.out.println(points);
		points = EnumSet.allOf(Activity.class);
		System.out.println(points);
		points.removeAll(EnumSet.of(RUNNING));
		System.out.println(points);
	}
}
