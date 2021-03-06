/* 
 * TURNUS - www.turnus.co
 * 
 * Copyright (C) 2010-2016 EPFL SCI STI MM
 *
 * This file is part of TURNUS.
 *
 * TURNUS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * TURNUS is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with TURNUS.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Additional permission under GNU GPL version 3 section 7
 * 
 * If you modify this Program, or any covered work, by linking or combining it
 * with Eclipse (or a modified version of Eclipse or an Eclipse plugin or 
 * an Eclipse library), containing parts covered by the terms of the 
 * Eclipse Public License (EPL), the licensors of this Program grant you 
 * additional permission to convey the resulting work.  Corresponding Source 
 * for a non-source form of such a combination shall include the source code 
 * for the parts of Eclipse libraries used as well as that of the  covered work.
 * 
 */
package turnus.model.analysis.bottlenecks;

import java.util.List;

import turnus.model.analysis.AnalysisReport;

import turnus.model.dataflow.Network;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduled Impact Analysis Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link turnus.model.analysis.bottlenecks.ScheduledImpactAnalysisReport#getNetwork <em>Network</em>}</li>
 *   <li>{@link turnus.model.analysis.bottlenecks.ScheduledImpactAnalysisReport#isClassLevel <em>Class Level</em>}</li>
 *   <li>{@link turnus.model.analysis.bottlenecks.ScheduledImpactAnalysisReport#getScheduledImpactData <em>Scheduled Impact Data</em>}</li>
 *   <li>{@link turnus.model.analysis.bottlenecks.ScheduledImpactAnalysisReport#getInitialBottlenecksWithScheduling <em>Initial Bottlenecks With Scheduling</em>}</li>
 * </ul>
 *
 * @see turnus.model.analysis.bottlenecks.BottlenecksPackage#getScheduledImpactAnalysisReport()
 * @model
 * @generated
 */
public interface ScheduledImpactAnalysisReport extends AnalysisReport {
	/**
	 * Returns the value of the '<em><b>Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' reference.
	 * @see #setNetwork(Network)
	 * @see turnus.model.analysis.bottlenecks.BottlenecksPackage#getScheduledImpactAnalysisReport_Network()
	 * @model
	 * @generated
	 */
	Network getNetwork();

	/**
	 * Sets the value of the '{@link turnus.model.analysis.bottlenecks.ScheduledImpactAnalysisReport#getNetwork <em>Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(Network value);

	/**
	 * Returns the value of the '<em><b>Class Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Level</em>' attribute.
	 * @see #setClassLevel(boolean)
	 * @see turnus.model.analysis.bottlenecks.BottlenecksPackage#getScheduledImpactAnalysisReport_ClassLevel()
	 * @model
	 * @generated
	 */
	boolean isClassLevel();

	/**
	 * Sets the value of the '{@link turnus.model.analysis.bottlenecks.ScheduledImpactAnalysisReport#isClassLevel <em>Class Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Level</em>' attribute.
	 * @see #isClassLevel()
	 * @generated
	 */
	void setClassLevel(boolean value);

	/**
	 * Returns the value of the '<em><b>Scheduled Impact Data</b></em>' containment reference list.
	 * The list contents are of type {@link turnus.model.analysis.bottlenecks.ScheduledImpactAnalysisData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Impact Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Impact Data</em>' containment reference list.
	 * @see turnus.model.analysis.bottlenecks.BottlenecksPackage#getScheduledImpactAnalysisReport_ScheduledImpactData()
	 * @model containment="true"
	 * @generated
	 */
	List<ScheduledImpactAnalysisData> getScheduledImpactData();

	/**
	 * Returns the value of the '<em><b>Initial Bottlenecks With Scheduling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Bottlenecks With Scheduling</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Bottlenecks With Scheduling</em>' containment reference.
	 * @see #setInitialBottlenecksWithScheduling(BottlenecksWithSchedulingReport)
	 * @see turnus.model.analysis.bottlenecks.BottlenecksPackage#getScheduledImpactAnalysisReport_InitialBottlenecksWithScheduling()
	 * @model containment="true"
	 * @generated
	 */
	BottlenecksWithSchedulingReport getInitialBottlenecksWithScheduling();

	/**
	 * Sets the value of the '{@link turnus.model.analysis.bottlenecks.ScheduledImpactAnalysisReport#getInitialBottlenecksWithScheduling <em>Initial Bottlenecks With Scheduling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Bottlenecks With Scheduling</em>' containment reference.
	 * @see #getInitialBottlenecksWithScheduling()
	 * @generated
	 */
	void setInitialBottlenecksWithScheduling(BottlenecksWithSchedulingReport value);

} // ScheduledImpactAnalysisReport
