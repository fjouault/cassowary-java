package org.pybee.cassowary;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Util {
    public static boolean approx(double a, double b)
    {
        double epsilon = 1.0e-8;
        if (a == 0.0)
        {
	        return (Math.abs(b) < epsilon);
        }
        else if (b == 0.0)
        {
	        return (Math.abs(a) < epsilon);
        }
        else
        {
	        return (Math.abs(a-b) < Math.abs(a) * epsilon);
        }
    }

    public static boolean approx(Variable clv, double b)
    {
        return approx(clv.getValue(),b);
    }

    public static boolean approx(double a, Variable clv)
    {
        return approx(a,clv.getValue());
    }

	public static <K, V> Map<K, V> newMap() {
		return new LinkedHashMap<K,V>();
		// Should thread-safety be necessary, use the following
//		return Collections.synchronizedMap(new LinkedHashMap<K,V>());
	}

	public static <E> Set<E> newSet() {
		return new LinkedHashSet<E>();
		// Should thread-safety be necessary, use the following
//		return Collections.synchronizedSet(new LinkedHashSet<E>());
	}
}
