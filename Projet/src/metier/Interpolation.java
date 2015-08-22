package metier;

public class Interpolation {
	
	
	public double linearInterpolation(double x_val[], double y_val[], double x_point, boolean allowExtrapolation)
	   
	 {

	  double x_prev, y_prev, x_next, y_next, slope;
	  int v;

	  // Get number of points
	  v = x_val.length;

	  // Obtain previous and next point
	  x_prev = x_point;
	  x_next = x_point;
	  y_prev = 0.0;
	  y_next = 0.0;

	  int iprev = 0, inext = 0;
	  for (int i = 0; i < v; i++)
	  {
	   if (x_val[i] == x_point)
	    return y_val[i];

	   if (x_val[i] < x_point && (x_val[i] > x_prev || x_prev == x_point))
	   {
	    x_prev = x_val[i];
	    y_prev = y_val[i];
	    iprev = i;

	   }

	   if (x_val[i] > x_point && (x_val[i] < x_next || x_next == x_point))
	   {
	    x_next = x_val[i];
	    y_next = y_val[i];
	    inext = i;
	   }

	  }

	  // Correct values if no previous or next point exist, if extrapolation
	  // is allowed
	  if (allowExtrapolation)
	  {
	   if (x_prev == x_point)
	   {
	    x_prev = x_val[inext + 1];
	    y_prev = y_val[inext + 1];
	   }
	   if (x_next == x_point)
	   {
	    x_next = x_val[iprev - 1];
	    y_next = y_val[iprev - 1];
	   }
	  } else
	  {
	   if (x_prev == x_point || x_next == x_point)
	   {
//	    System.out.println(x_point + "/" + getMinimumValue(x_val) + "/" + DataSet
//	      .getMaximumValue(x_val));
	    throw new IllegalArgumentException(
	      "interpolation point out of range, extrapolation required.");
	   }
	  }

	  // Interpolate
	  slope = 0.0;
	  if (!(x_next == x_prev))
	  {
	   slope = (y_next - y_prev) / (x_next - x_prev);
	  }
	  double y_point = y_prev + slope * (x_point - x_prev);

	  return y_point;
	 }

}
