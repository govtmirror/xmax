package com.isti.traceview.transformations;

import java.util.List;

import javax.swing.JFrame;

import com.isti.traceview.common.TimeInterval;
import com.isti.traceview.data.PlotDataProvider;
import com.isti.traceview.filters.IFilter;

/**
 * Interface to represent abstract transformation. Transformation accepts list
 * of traces and creates a new data product (for example PSD, Spectra) and
 * passes the output for the display or storage
 * 
 * @author Max Kokoulin
 */

public interface ITransformation {

	/**
	 * Performs transformations
	 * 
	 * @param input
	 *            List of traces to process
	 * @param ti
	 *            Time interval to define processed range
	 * @param filter
	 *            Filter applied before transformation
	 * @param parentFrame
	 *            Host frame
	 */
	public void transform(List<PlotDataProvider> input, TimeInterval ti, IFilter filter, Object configiration,
			JFrame parentFrame);

	/**
	 * Sets maximum amount of processed data
	 */
	public void setMaxDataLength(int dataLength);

	/**
	 * Return name of transformation
	 */
	public String getName();

}
