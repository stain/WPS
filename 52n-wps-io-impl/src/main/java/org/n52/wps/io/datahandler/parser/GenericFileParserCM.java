/**
 * ﻿Copyright (C) 2007 - 2014 52°North Initiative for Geospatial Open Source
 * Software GmbH
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 as published
 * by the Free Software Foundation.
 *
 * If the program is linked with libraries which are licensed under one of
 * the following licenses, the combination of the program with the linked
 * library is not considered a "derivative work" of the program:
 *
 *       • Apache License, version 2.0
 *       • Apache Software License, version 1.0
 *       • GNU Lesser General Public License, version 3
 *       • Mozilla Public License, versions 1.0, 1.1 and 2.0
 *       • Common Development and Distribution License (CDDL), version 1.0
 *
 * Therefore the distribution of the program linked with libraries licensed
 * under the aforementioned licenses, is permitted by the copyright holders
 * if the distribution is compliant with both the GNU General Public
 * License version 2 and the aforementioned licenses.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details.
 */
package org.n52.wps.io.datahandler.parser;

import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.n52.wps.webapp.api.AlgorithmEntry;
import org.n52.wps.webapp.api.ConfigurationCategory;
import org.n52.wps.webapp.api.ConfigurationModule;
import org.n52.wps.webapp.api.FormatEntry;
import org.n52.wps.webapp.api.types.BooleanConfigurationEntry;
import org.n52.wps.webapp.api.types.ConfigurationEntry;
import org.n52.wps.webapp.api.types.DoubleConfigurationEntry;
import org.n52.wps.webapp.api.types.FileConfigurationEntry;
import org.n52.wps.webapp.api.types.IntegerConfigurationEntry;
import org.n52.wps.webapp.api.types.StringConfigurationEntry;
import org.n52.wps.webapp.api.types.URIConfigurationEntry;

public class GenericFileParserCM implements ConfigurationModule{

	private boolean isActive = true;
	private ConfigurationEntry<String> entry1 = new StringConfigurationEntry("test.string.key", "String Title", "Desc",
			true, "Initial Value");
	private ConfigurationEntry<Integer> entry2 = new IntegerConfigurationEntry("test.integer.key", "Integer Title",
			"Integer Desc", true, 44);
	private ConfigurationEntry<Double> entry3 = new DoubleConfigurationEntry("test.double.key", "Double Title",
			"Double Desc", true, 10.4);
	private ConfigurationEntry<Boolean> entry4 = new BooleanConfigurationEntry("test.boolean.key", "Boolean Title",
			"Boolean Desc", true, true);
	private ConfigurationEntry<File> entry5 = new FileConfigurationEntry("test.file.key", "File Title", "File Desc",
			true, new File("path"));
	private ConfigurationEntry<URI> entry6 = new URIConfigurationEntry("test.uri.key", "URI Title", "URI Desc", true,
			URI.create("path"));

	private ConfigurationEntry<String> entry7 = new StringConfigurationEntry("test.string.key2", "String Title",
			"Desc", true, "Initial Value 2");
	private IntegerConfigurationEntry entry8 = new IntegerConfigurationEntry("test.integer.key2", "Integer Title",
			"Integer Desc", true, 15);

	private List<? extends ConfigurationEntry<?>> configurationEntries = Arrays.asList(entry1, entry2, entry3, entry4,
			entry5, entry6, entry7, entry8);
	
	private List<FormatEntry> formatEntries;
	
	public GenericFileParserCM(){
		formatEntries = new ArrayList<>();
	}
	
	@Override
	public String getModuleName() {
		return "GenericFileParser Configuration Module";
	}

	@Override
	public boolean isActive() {
		return isActive;
	}

	@Override
	public void setActive(boolean active) {
		this.isActive = active;		
	}

	@Override
	public ConfigurationCategory getCategory() {
		return ConfigurationCategory.PARSER;
	}

	@Override
	public List<? extends ConfigurationEntry<?>> getConfigurationEntries() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AlgorithmEntry> getAlgorithmEntries() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FormatEntry> getFormatEntries() {
		return formatEntries;
	}

}