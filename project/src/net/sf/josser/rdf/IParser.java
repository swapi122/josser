/*
 ****************************************************************************************
 * Copyright � Giovanni Novelli                                             
 * All Rights Reserved.                                                                 
 ****************************************************************************************
 *
 * Title:       JOSSER
 *
 * Description: JOSSER - A Java Tool capable to parse DMOZ RDF dumps and export them to 
 *              any JDBC compliant relational database 
 *               
 * IParser.java
 *
 * Created on 22 October 2005, 22.00 by Giovanni Novelli
 *
 ****************************************************************************************
 * JOSSER is available under the terms of the GNU General Public License Version 2.    
 *                                                                                      
 * The author does NOT allow redistribution of modifications of JOSSER under the terms 
 * of the GNU General Public License Version 3 or any later version.                   
 *                                                                                     
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY     
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A     
 * PARTICULAR PURPOSE.                                                                 
 *                                                                                     
 * For more details read file LICENSE
 *****************************************************************************************
 *
 * $Revision: 92 $
 * $Id: IParser.java 92 2007-07-17 13:42:11Z admin $
 * $HeadURL: file:///var/svn/dmoz/trunk/netbeans/josser/src/net/sf/josser/rdf/IParser.java $
 *
 *****************************************************************************************
 */

package net.sf.josser.rdf;

/**
 * @author Copyright � Giovanni Novelli. All rights reserved.
 */
public interface IParser {
	public abstract String getPath();

	public abstract void parse(int grouplines);

	public abstract void process(String line);

	public abstract int batchClear();

	public abstract int batchStore();
}