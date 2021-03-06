/*******************************************************************************
 * Copyright (C) 2018 Ortis (cao.ortis.org@gmail.com)
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/
package org.ortis.mochimo.farm_manager.farm.miner;

/**
 * Mochimo miner
 * 
 * @author Ortis <br>
 *         2018 Jul 01 11:57:03 PM <br>
 */
public interface Miner
{

	boolean start() throws Exception;

	boolean stop() throws Exception;

	boolean isRunning() throws Exception;

	/**
	 * Update {@link MinerStatistics}
	 */
	void updateStatistics() throws Exception;

	/**
	 * Delete {@link MinerStatistics}
	 * 
	 * @throws Exception
	 */
	void clearStatistics();

	/**
	 * Return last {@link MinerStatistics}
	 * 
	 * @return {@link MinerStatistics}
	 */
	MinerStatistics getStatistics();
	
	
	String getId();

}
