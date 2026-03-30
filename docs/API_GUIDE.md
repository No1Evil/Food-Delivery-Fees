# Headers

`X-API-VERSION` header to specify the api version.

`Authorization`: `Bearer: <JWT_TOKEN>` header for admin endpoints.

# Auth endpoint

`POST` `/api/auth/login?username=admin&password=admin`
* Returns jwt token.

# Public endpoints
<details>

## total-fee-controller

`GET` `/api/fee/total`
* Body:
```json
{
  "regionId": 0, 
  "vehicleTypeId": 0, 
  "timestamp":"2026-03-30T16:19:09.006Z"
}
```
* Returns total fee based on latest measurement.

## vehicle-type-controller

`GET` `/api/public/vehicles`
* Returns all vehicles.

`GET` `/api/public/vehicles/find/?type=car`
* finds vehicle by it`s name.

## region-controller

`GET` `/api/public/regions`
* Returns all regions.

`GET` `/api/public/regions/find/?name=Tallinn-Harku`
* finds region by it`s name.

</details>

# Admin endpoints

<details>

## region-admin-controller

`POST` `/api/admin/regions`
* Body: 
```json
{
  "regionName": {"value": "Tartu"}, 
  "wmoCode": {"value": "12321"}
}
```
* Returns created region id.

`GET` `/api/admin/regions/{id}`
* Returns found region by id.

`DELETE` `/api/admin/regions/{id}`
* Returns if region is deleted.

## vehicle-type-admin-controller

`POST` `/api/admin/vehicles`
* Body:
```json
{
  "vehicleType": {"value": "car"}
}
```
* Returns created vehicle id

`GET` `/api/admin/vehicles/{id}`
* Returns vehicle by id.

`DELETE` `/api/admin/regions/{id}`
* Returns if vehicle is deleted.

## measurement-admin-controller
`GET` `/api/admin/measurements`

`GET` `/api/admin/measurements/{id}`

`POST` `/api/admin/measurements/sync`
* Description: manually starts the sync with
measurements provider *(www.ilmateenistus.ee)*

`POST` `/api/admin/measurements`
* Body:
```json
{
  "regionId": 0,
  "airTemperature": 0,
  "windSpeed": 0,
  "weatherPhenomenon": {
    "value": "clear"
  },
  "measuredAt": "2026-03-30T16:37:47.458Z"
}
```

`DELETE` `/api/admin/measurements/{id}`

## wind-speed-fee-controller
`GET` `/api/admin/fee/wind-speed/{id}`

`POST` `/api/admin/fee/wind-speed/base-fee`
* Body
```json
{
  "vehicleTypeId": 0,
  "windSpeed": 0
}
```

`POST` `/api/admin/fee/wind-speed`
* Body
```json
{
  "vehicleTypeId": 0,
  "minWindSpeed": 0,
  "maxWindSpeed": 0,
  "fee": 0,
  "isAllowed": true
}
```

`DELETE` `/api/admin/fee/wind-speed/{id}`

## weather-phenomenon-fee-controller
`GET` `/api/admin/fee/weather-phenomenon/{id}`

`POST` `/api/admin/fee/weather-phenomenon/base-fee`
* Body
```json
{
  "vehicleTypeId": 0,
  "weatherPhenomenon": {
    "value": "string"
  }
}
```

`POST` `/api/admin/fee/weather-phenomenon`
* Body
```json
{
  "vehicleTypeId": 0,
  "weatherPhenomenon": {
    "value": "string"
  },
  "fee": 0,
  "isAllowed": true
}
```

`DELETE` `/api/admin/fee/weather-phenomenon/{id}`

## regional-based-fee-controller
`GET` `/api/admin/fee/regional-based/{id}`

`POST` `/api/admin/fee/regional-based/base-fee`
* Body:
```json
{
  "vehicleTypeId": 0,
  "regionId": 0
}
```

`POST` `/api/admin/fee/regional-based`
* Body:
```json
{
  "regionId": 0,
  "vehicleTypeId": 0,
  "fee": 0,
  "isAllowed": true
}
```

`DELETE` `/api/admin/fee/weather-phenomenon/{id}`

## air-temperature-fee-controller
`GET` `/api/admin/fee/air-temperature/{id}`

`POST` `/api/admin/fee/air-temperatures/base-fee`
* Body:
```json
{
  "vehicleTypeId": 0,
  "temperature": 0
}
```

`POST` `/api/admin/fee/air-temperatures`
* Body:
```json
{
  "vehicleTypeId": 0,
  "minTemperature": 0,
  "maxTemperature": 0,
  "fee": 0,
  "isAllowed": true
}
```

`DELETE` `/api/admin/fee/weather-phenomenon/{id}`

</details>