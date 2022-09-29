# MonitorApp
- This is an app that displays BMI info

# Owner
- Mihut Denisa Georgiana
- 16.08.2022
- Lang: EN

# Sources
- http://www.checkyourhealth.org/eat-healthy/cal_calculator.php: Used to calculate calorie deficits in order to gain weight
- http://healthyweight.health.gov.au/wps/portal/Home/get-started/are-you-a-healthy-weight/bmi/: Data stripped into BMIDetailsActivity, equation used in BMIActivity
- https://github.com/PhilJay/MPAndroidChart: The graphing library used in GraphFragment
- https://medium.com/@karthikr1493/building-a-bmi-computing-android-app-using-kotlin-6088858dec17: For calculating BMI data

# Features
- MVVM Architecture
- RecyclerView using GridLayoutManager
- Using Fragment and Activity
- Using Room
- Retrofit
- Using API queries to populate local DB
- SearchView for Fragment & Activity
- Glide library to display image views
- Using coroutines

# Finished Tasks
- Chose architecture + ui mockup
- Added app color palette
- Added app logo
- Created two new activities

# Current Tasks
- Make the preferences tab in a fragment
- Create ui for third activity

# Future Tasks
- Take a quote from an API and display it on splash screen
- Save and load weight data in both Metric and Imperial
- Display this weight in an interactive graph (Thanks to [PhilJay's MPAndroidChart Library](https://github.com/PhilJay/MPAndroidChart))
- Generates statistics based on Gain/Loss streaks and average weight change over the last week
- Calculate BMI based on users' personal data
- Unit converter (kg-lbs etc.) Calculates daily calorie allowance to maintain weight based on BMR and activity level
- Calculates how long until weight goal achieved given calorie deficit
- All data is shareable across apps
