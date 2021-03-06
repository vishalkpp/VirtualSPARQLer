/*
 * Copyright (C) 2014 Vishal Siramshetty <srmshtty[at]gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package de.fhg.scai.bio.vocab;

/**
 * This class holds different file formats that user can choose while saving the
 * query result.
 *
 * @author Vishal Siramshetty <srmshtty[at]gmail.com>
 */
public class QueryResult {

    /**
     *
     * Text file format
     */
    public static String FORMAT_TXT = ".txt";
    /**
     *
     * Comma separated file format
     */
    public static String FORMAT_CSV = ".csv";
    /**
     *
     * Tab separated file format
     */
    public static String FORMAT_TSV = ".tsv";
    /**
     *
     * XML file format
     */
    public static String FORMAT_XML = ".xml";
    /**
     *
     * JSON file format
     */
    public static String FORMAT_JSON = ".json";
}
