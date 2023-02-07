package by.academy.HW7;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

import by.academy.jUnit.listener.OurListener;

public class CalculatorRunner extends BlockJUnit4ClassRunner{
		private OurListener ourListener;

		public CalculatorRunner(Class<OurListener> clz) throws InitializationError {
			super(clz);
			ourListener = new OurListener();
		}

		@Override
		public void run(final RunNotifier notifier) {
			notifier.addListener(ourListener);
			super.run(notifier);
		}
	}

