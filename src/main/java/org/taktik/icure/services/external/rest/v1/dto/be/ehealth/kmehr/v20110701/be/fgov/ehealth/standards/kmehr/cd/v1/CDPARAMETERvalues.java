/*
 * Copyright (C) 2018 Taktik SA
 *
 * This file is part of iCureBackend.
 *
 * iCureBackend is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2 as published by
 * the Free Software Foundation.
 *
 * iCureBackend is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with iCureBackend.  If not, see <http://www.gnu.org/licenses/>.
 */

//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.03.05 à 11:47:59 AM CET 
//


package org.taktik.icure.services.external.rest.v1.dto.be.ehealth.kmehr.v20110701.be.fgov.ehealth.standards.kmehr.cd.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CD-PARAMETERvalues.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CD-PARAMETERvalues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="weight"/>
 *     &lt;enumeration value="height"/>
 *     &lt;enumeration value="bmi"/>
 *     &lt;enumeration value="sbp"/>
 *     &lt;enumeration value="dbp"/>
 *     &lt;enumeration value="pulsecharacter"/>
 *     &lt;enumeration value="heartrate"/>
 *     &lt;enumeration value="peakflow"/>
 *     &lt;enumeration value="gpa"/>
 *     &lt;enumeration value="headcircumference"/>
 *     &lt;enumeration value="hipcircumference"/>
 *     &lt;enumeration value="apgar"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CD-PARAMETERvalues")
@XmlEnum
public enum CDPARAMETERvalues {

    @XmlEnumValue("weight")
    WEIGHT("weight"),
    @XmlEnumValue("height")
    HEIGHT("height"),
    @XmlEnumValue("bmi")
    BMI("bmi"),
    @XmlEnumValue("sbp")
    SBP("sbp"),
    @XmlEnumValue("dbp")
    DBP("dbp"),
    @XmlEnumValue("pulsecharacter")
    PULSECHARACTER("pulsecharacter"),
    @XmlEnumValue("heartrate")
    HEARTRATE("heartrate"),
    @XmlEnumValue("peakflow")
    PEAKFLOW("peakflow"),
    @XmlEnumValue("gpa")
    GPA("gpa"),
    @XmlEnumValue("headcircumference")
    HEADCIRCUMFERENCE("headcircumference"),
    @XmlEnumValue("hipcircumference")
    HIPCIRCUMFERENCE("hipcircumference"),
    @XmlEnumValue("apgar")
    APGAR("apgar");
    private final String value;

    CDPARAMETERvalues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CDPARAMETERvalues fromValue(String v) {
        for (CDPARAMETERvalues c: CDPARAMETERvalues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
