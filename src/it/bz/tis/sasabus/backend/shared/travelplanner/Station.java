/*
SASAbusBackend - SASA bus JSON services

Copyright (C) 2013 TIS Innovation Park - Bolzano/Bozen - Italy

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as
published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program. If not, see <http://www.gnu.org/licenses/>.
*/

package it.bz.tis.sasabus.backend.shared.travelplanner;

/**
 * @author Davide Montesin <d@vide.bz>
 */
public class Station
{
   Station(Void void1)
   {
   }

   String name;
   String externalId;
   String externalStationNr;
   String type;
   String x;
   String y;

   public String getName()
   {
      return this.name;
   }

   public String getExternalId()
   {
      return this.externalId;
   }

   public String getExternalStationNr()
   {
      return this.externalStationNr;
   }

   public String getType()
   {
      return this.type;
   }

   public String getX()
   {
      return this.x;
   }

   public String getY()
   {
      return this.y;
   }

}
