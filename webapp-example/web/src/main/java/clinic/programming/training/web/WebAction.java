package clinic.programming.training.web;

import clinic.programming.training.core.ComputeTotals;

public class WebAction {
	public void total() {
		ComputeTotals totals = new ComputeTotals();
		totals.total();
	}
}
