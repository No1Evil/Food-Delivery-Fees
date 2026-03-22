select * from weather_phenomenon_fees w
where (w.vehicle_type_id = ? or w.vehicle_type_id is null)
and (w.weather_phenomenon = ? or w.weather_phenomenon is null)
order by w.vehicle_type_id desc
limit 1