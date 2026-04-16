package me.fit.model;

import java.util.Date;
import java.util.Objects;

public class TimeResponse {
  public String abbreviation;
  public String client_ip;
  public Date datetime;
  public int day_of_week;
  public int day_of_year;
  public boolean dst;
  public int dst_offset;
  public int raw_offset;
  public String timezone;
  public int unixtime;
  public Date utc_datetime;
  public String utc_offset;
  public int week_number;

  public TimeResponse(){
  }

  public TimeResponse(String abbreviation, String client_ip, Date datetime, int day_of_week, int day_of_year, boolean dst, int dst_offset, int raw_offset, String timezone, int unixtime, Date utc_datetime, String utc_offset, int week_number) {
    this.abbreviation = abbreviation;
    this.client_ip = client_ip;
    this.datetime = datetime;
    this.day_of_week = day_of_week;
    this.day_of_year = day_of_year;
    this.dst = dst;
    this.dst_offset = dst_offset;
    this.raw_offset = raw_offset;
    this.timezone = timezone;
    this.unixtime = unixtime;
    this.utc_datetime = utc_datetime;
    this.utc_offset = utc_offset;
    this.week_number = week_number;
  }

  public String getAbbreviation() {
    return abbreviation;
  }

  public String getClient_ip() {
    return client_ip;
  }

  public Date getDatetime() {
    return datetime;
  }

  public int getDay_of_week() {
    return day_of_week;
  }

  public int getDay_of_year() {
    return day_of_year;
  }

  public boolean isDst() {
    return dst;
  }

  public int getDst_offset() {
    return dst_offset;
  }

  public int getRaw_offset() {
    return raw_offset;
  }

  public String getTimezone() {
    return timezone;
  }

  public int getUnixtime() {
    return unixtime;
  }

  public Date getUtc_datetime() {
    return utc_datetime;
  }

  public String getUtc_offset() {
    return utc_offset;
  }

  public int getWeek_number() {
    return week_number;
  }

  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public void setClient_ip(String client_ip) {
    this.client_ip = client_ip;
  }

  public void setDatetime(Date datetime) {
    this.datetime = datetime;
  }

  public void setDay_of_week(int day_of_week) {
    this.day_of_week = day_of_week;
  }

  public void setDay_of_year(int day_of_year) {
    this.day_of_year = day_of_year;
  }

  public void setDst(boolean dst) {
    this.dst = dst;
  }

  public void setDst_offset(int dst_offset) {
    this.dst_offset = dst_offset;
  }

  public void setRaw_offset(int raw_offset) {
    this.raw_offset = raw_offset;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public void setUnixtime(int unixtime) {
    this.unixtime = unixtime;
  }

  public void setUtc_datetime(Date utc_datetime) {
    this.utc_datetime = utc_datetime;
  }

  public void setUtc_offset(String utc_offset) {
    this.utc_offset = utc_offset;
  }

  public void setWeek_number(int week_number) {
    this.week_number = week_number;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof TimeResponse that)) return false;
    return day_of_week == that.day_of_week && day_of_year == that.day_of_year && dst == that.dst && dst_offset == that.dst_offset && raw_offset == that.raw_offset && unixtime == that.unixtime && week_number == that.week_number && Objects.equals(abbreviation, that.abbreviation) && Objects.equals(client_ip, that.client_ip) && Objects.equals(datetime, that.datetime) && Objects.equals(timezone, that.timezone) && Objects.equals(utc_datetime, that.utc_datetime) && Objects.equals(utc_offset, that.utc_offset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abbreviation, client_ip, datetime, day_of_week, day_of_year, dst, dst_offset, raw_offset, timezone, unixtime, utc_datetime, utc_offset, week_number);
  }

  @Override
  public String toString() {
    return "TimeResponse{" +
      "abbreviation='" + abbreviation + '\'' +
      ", client_ip='" + client_ip + '\'' +
      ", datetime=" + datetime +
      ", day_of_week=" + day_of_week +
      ", day_of_year=" + day_of_year +
      ", dst=" + dst +
      ", dst_offset=" + dst_offset +
      ", raw_offset=" + raw_offset +
      ", timezone='" + timezone + '\'' +
      ", unixtime=" + unixtime +
      ", utc_datetime=" + utc_datetime +
      ", utc_offset='" + utc_offset + '\'' +
      ", week_number=" + week_number +
      '}';
  }
}
